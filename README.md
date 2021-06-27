# elasticstash-example

### Preparing environment

Download Elastic Search
https://www.elastic.co/pt/downloads/elasticsearch

Donwload Kibana
https://www.elastic.co/pt/downloads/kibana

Download Logstash
https://www.elastic.co/pt/downloads/logstash


### Starting ELK

1. GO to Elastic Search bin folder and execute elasticsearch.bat from prompt:
.\elasticsearch.bat

2. GO to Kibana bin folder and execute kibana.bat from prompt:
.\kibana.bat

3. Edit logstash.conf:

```
input{
	file{
		type => "syslog"
		path => "D:/work/logs/application.log"
	}
}

output{
	stdout{ 
		codec => rubydebug 
	}
	
	elasticsearch{
		hosts => ["localhost:9200"]
		index => "codeboardapplog"
	}
}
```
4. GO to logstash bin folder and execute stash.bat from prompt:
.\logstash.bat -f ..\conf\logstash.conf


# Success environment ELK is working, let's run project !!!!

  
