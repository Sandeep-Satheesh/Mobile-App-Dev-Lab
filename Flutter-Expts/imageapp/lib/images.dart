import 'package:flutter/material.dart';

class Images extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.indigo,
      appBar: AppBar(
        title: Row(
          children: [
            Text('MAD Lab Expt'),
          ],
        ),
        centerTitle: true,
        backgroundColor: Colors.black,
      ),
      body: Center(
        child: Column(
          children: [
            Container(
                width: 1000,
                height: 50,
                margin: const EdgeInsets.only(bottom: 40),
                color: Colors.blue,
                child: Center(
                  child: Text(
                    'Image Formatting',
                    style: TextStyle(
                      fontStyle: FontStyle.italic,
                      fontSize: 25,
                    ),
                  ),
                )),
            CircleAvatar(
              radius: 75,
              backgroundImage: AssetImage('images/image.jpg'),
            ),
            SizedBox(
              width: 15,
            ),
            Padding(
              padding: const EdgeInsets.all(15.0),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  ClipRRect(
                      borderRadius: BorderRadius.circular(75),
                      child: Image.asset(
                        'images/music.jpg',
                        height: 150,
                        width: 150,
                      )
                  )
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
