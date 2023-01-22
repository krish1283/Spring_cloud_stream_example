# Spring_cloud_stream_example

POC for Spring cloud stream with KAfka binder.
The utility exposes a REST API POST to accept a json input and then uses Spring cloud stream StreamBridge to send the payload to a kafka topic called toStream-out-0.

From toStream-out-0 there is a funcion definition named Function<String, String> uppercase()  which take the payload and converts it to upper case
and then put the message on upperStream kafka topic.

All this is done using Spring cloud stream binder mechanism. The beneift is, a simple function is behaving as kafka consumer/producer with no boilerplate code.

Refer to application.yml file for the configuration. 
