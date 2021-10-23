import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'MAD Lab Expt 1',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: Scaffold(
        appBar: AppBar(
          title: const Text('MAD Lab Expt 1',
              style: TextStyle(
                  fontWeight: FontWeight.bold,
                  color: Colors.red,
                  backgroundColor: Colors.yellow
              )),
        ),
        body: const Center(
          child: Text('Hello World!',
          style: TextStyle(
              fontSize: 50.0,
              fontStyle: FontStyle.italic,
              color: Colors.yellow,
              backgroundColor: Colors.indigo
          ))
        ),
      ),
    );
  }
}
