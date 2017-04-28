//SimpleDateFormat

	  // Create a new Date object from the time in milliseconds of the earthquake
     Date dateObject = new Date(currentEarthquake.getmTimeInMilliseconds());

	 SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("h:mm a");
     simpleDateFormat.format(dateObject);
	 
//Split 

		private static final String LOCATION_SEPARATOR = " of ";
		 // assign the location of the current earthquake to String originalLocation
        String originalLocation = currentEarthquake.getmLocation();

        //declared primaryLocation variable
        String primaryLocation;

        //declared locationOffset variable
        String locationOffset;
		
	
	 if(originalLocation.contains(LOCATION_SEPARATOR)){
            String[] parts  = originalLocation.split(LOCATION_SEPARATOR);
            primaryLocation = parts[1];
            locationOffset = parts[0] + LOCATION_SEPARATOR;
        }else{
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }
		
//DecimalFormat

//New intent for URL

In QueryUtils extractEarthquake():

  // Extract the value for the key called "url"
  String url = properties.getString("url");

  // Create a new {@link Earthquake} object with the magnitude, location, time,
  // and url from the JSON response.
  Earthquake earthquake = new Earthquake(magnitude, location, time, url);
  
  
  
  //TIPS
				 //convert the time in milliseconds into a Date object by calling the Date constructor.
                Date dateObject  = new Date(time);
  
				//initialize a SimpleDateFormat instance
                // configure it to provide a more readable representation according to the given format.
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM DD, yyyy");
                String dateToDisplay  =  simpleDateFormat.format(dateObject);


				
				In EarthquakeActivity onCreate():

  ...

  // Create a new adapter that takes the list of earthquakes as input
  final EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

  // Set the adapter on the {@link ListView}
  // so the list can be populated in the user interface
  earthquakeListView.setAdapter(adapter);

  earthquakeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
     @Override
     public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
         // Find the current earthquake that was clicked on
         Earthquake currentEarthquake = adapter.getItem(position);

         // Convert the String URL into a URI object (to pass into the Intent constructor)
         Uri earthquakeUri = Uri.parse(currentEarthquake.getUrl());

         // Create a new intent to view the earthquake URI
         Intent websiteIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);

         // Send the intent to launch a new activity
         startActivity(websiteIntent);
     }
  });
