void main(List<String> args) {
  // 10. Suppose, your distance to office from home is 25 km and you travel 40 km per hour. Write a program to calculate time taken to reach office in minutes. Formula= (distance) / (speed)
  int? distance = 25;
  int? speed = 40;
  double? timeRequired = distance/speed;
  double? timeRequiredMinutes = timeRequired*60;
  print('\ntime taken to reach office in minutes: $timeRequiredMinutes \n');
}
