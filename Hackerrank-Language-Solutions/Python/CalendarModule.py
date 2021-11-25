import calendar

day, month, year = (map(int, input("Date: ").split()))

print(["MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"][calendar.weekday(year, month, day)])

#Could have used ***calendar.day_name*** to generate the list of the day names#