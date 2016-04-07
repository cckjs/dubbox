namespace java com.alibaba.example.thrift.api
struct User {
  1: required string name, 
  2: optional i32 age = 26,
  3: string gender,
  4: required i16 id
  }
  
service  UserThriftService{
   User getUser(1:i16 id);
}