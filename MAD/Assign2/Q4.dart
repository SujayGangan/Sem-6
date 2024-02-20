import 'dart:io';

void main(List<String> args) {
  // 4.Write a dart program to print your name 100 times.

  print("Enter your name :");
  String? nm1=stdin.readLineSync()!;

  for(int i=0;i<100;i++) {
    print("My name is:$nm1");
  }
  
}
