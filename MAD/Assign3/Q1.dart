import 'dart:io';

void main(List<String> args) {
  // 1. Write a program in Dart that find the area of a circle using function. Formula: pi * r * r

  stdout.write(
      "Enter the length of radius of circle for which you have to find area : ");
  double? radius = double.parse(stdin.readLineSync()!);

  stdout.write("Area of circle is : ${areaOfCircle(radius)}");
}

double areaOfCircle(double r) {
  double area = 3.14 * r * r;
  return area;
}
