void main(List<String> args) {
  // 9. Suppose, you often go to restaurant with friends and you have to split amount of bill. Write a program to calculate split amount of bill. Formula= (total bill amount) / number of people
  int? numberOfPeople = 5;
  int? totalBillAmount = 750;
  double? billPerPerson = totalBillAmount/numberOfPeople;
  print('Bill per person is : $billPerPerson');
}
