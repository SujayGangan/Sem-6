import 'dart:io';

void main(List<String> args) {
  // 5. Write a dart program to calculate the sum of natural numbers.

  print("Enter the number upto you want addition:");
  int? n=int.parse(stdin.readLineSync()!);
  int sum=0;
  for(int i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  print("Sum of natural number upto $n is : $sum ");
}
