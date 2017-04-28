 /*Convert SAMPLE_JSON_RESPONSE String into a JSONObject
 Extract “features” JSONArray
 Loop through each feature in the array
 Get earthquake JSONObject at position i
 Get “properties” JSONObject
 Extract “mag” for magnitude
 Extract “place” for location
 Extract “time” for time
 Create Earthquake java object from magnitude, location, and time
 Add earthquake to list of earthquakes*/
 
 
 /**
 “y” stands for year, “yyyy” stands for a 4-digit year like 2016.
“M” stands for month, “MM” stands for a 2-digit month like 03.
“d” stands for day, “dd” stands for a 2-digit day like 10.
“H” stands for hour.
“m” stands for minute in hour.
“s” stands for second in minute.
 */
 
 // table for date patterns --> https://developer.android.com/reference/java/text/SimpleDateFormat.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics