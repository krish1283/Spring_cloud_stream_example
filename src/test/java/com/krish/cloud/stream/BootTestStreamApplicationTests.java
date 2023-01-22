//package com.krish.cloud.stream;
//
//import org.krish.cloud.steam.main.StreamCloudApp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Import;
//
//@SpringBootTest(classes =  StreamCloudApp.class)
//@Import({TestChannelBinderConfiguration.class})
//class BootTestStreamApplicationTests {
//
//    @Autowired
//    private InputDestination input;
//
//    @Autowired
//    private OutputDestination output;
//
//    @Test
//    void contextLoads() {
//        input.send(new GenericMessage<byte[]>("hello".getBytes()));
//        assertThat(output.receive().getPayload()).isEqualTo("HELLO".getBytes());
//    }
//}