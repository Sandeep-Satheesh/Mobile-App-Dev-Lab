import 'package:cached_network_image/cached_network_image.dart';
import 'package:flutter/material.dart';

class LocalCache extends StatelessWidget {
  const LocalCache({ Key? key }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      //backgroundColor: Colors.cyan,
      appBar: AppBar(
        title: Text('Local Cache'),
      ),
      body: Center(
          child: CachedNetworkImage(imageUrl: 'https://cdn.vox-cdn.com/thumbor/Ous3VQj1sn4tvb3H13rIu8eGoZs=/0x0:2012x1341/1400x788/filters:focal(0x0:2012x1341):format(jpeg)/cdn.vox-cdn.com/uploads/chorus_image/image/47070706/google2.0.0.jpg')
      ),
    );
  }
}