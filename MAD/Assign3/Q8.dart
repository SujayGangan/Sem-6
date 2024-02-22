import 'dart:io';

void main(List<String> args) {
// 8. Write a function in Dart called calculateArea that calculates the area of a rectangle.
//    It should take length and width as arguments, with a default value of 1 for both. Formula: length * width.

  stdout.write("Enter length of rectangle : ");
  int? length = int.parse(stdin.readLineSync()!);

  stdout.write("Enter width of rectangle : ");
  int? width = int.parse(stdin.readLineSync()!);

  stdout.write("Area of rectangle is : ${calculateArea(length, width)}");
}

int? calculateArea(int? length, int? width) {
  int? area = length! * width!;
  return (area);
}
