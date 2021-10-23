import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
            body: Center(
                child: Container(
                    height: 300,
                    width: 150,
                    decoration: BoxDecoration(
                        borderRadius: BorderRadius.circular(20),
                        color: Colors.black
                    ),
                    child: Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: <Widget>[
                          Container(
                            margin: EdgeInsets.all(10),
                            height: 60.0,
                            width: 60.0,
                            color: Colors.transparent,
                            child: Container(
                              decoration: BoxDecoration(
                                  color: Colors.red, shape: BoxShape.circle),
                            ),
                          ),
                          Container(
                            margin: EdgeInsets.all(10),
                            height: 60.0,
                            width: 60.0,
                            color: Colors.transparent,
                            child: Container(
                              decoration: BoxDecoration(
                                  color: Colors.yellow, shape: BoxShape.circle),
                            ),
                          ),
                      Container(
                        margin: EdgeInsets.all(10),
                        height: 60.0,
                        width: 60.0,
                        color: Colors.transparent,
                        child: Container(
                          decoration: BoxDecoration(
                              color: Colors.green, shape: BoxShape.circle),
                        ),
                      )
                    ]
                    )
                )
            )
        )
    );
  }
}
