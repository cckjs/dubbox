package com.alibaba.example.thrift.consumer;

import com.alibaba.example.thrift.api.UserThriftService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created by dell on 2016/4/7.
 */
public class BackendConsumer {
    public static void main(String[] args) throws TException {
// 设置传输通道 - 普通IO流通道
        TTransport transport = new TSocket("localhost", 7911);
        transport.open();

        //使用高密度二进制协议
        TProtocol protocol = new TCompactProtocol(transport);

        //创建Client
        UserThriftService.Client client = new UserThriftService.Client(protocol);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(client.getUser((short) i).getName());
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        //关闭资源
        transport.close();
    }
}
