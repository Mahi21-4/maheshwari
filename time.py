def convert_to_minutes(hours,minutes):
    if not all(map(lambda x:type(x)==int,[hours,minutes])):
           return 'invalid input.Hours and minutes must be integers'
    if not 0<= minutes<=59:
           return 'invalid input. Minutes must be between 0 and 59'
    total_minutes= hours*60+minutes
    return total_minutes
minutes =convert_to_minutes(4,9)
print(minutes)
