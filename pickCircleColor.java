 // Set the proper background color on the magnitude circle.
 // Fetch the background from the TextView, which is a GradientDrawable.
 GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();

 // Get the appropriate background color based on the current earthquake magnitude
 int magnitudeColor = getMagnitudeColor(currentEarthquake.getMagnitude());

 // Set the color on the magnitude circle
 magnitudeCircle.setColor(magnitudeColor);



private int getMagnitudeColor(double magnitude) {
    int magnitudeColorResourceId;
    int magnitudeFloor = (int) Math.floor(magnitude);
    switch (magnitudeFloor) {
        case 0:
        case 1:
            magnitudeColorResourceId = R.color.magnitude1;
            break;
        case 2:
            magnitudeColorResourceId = R.color.magnitude2;
            break;
        case 3:
            magnitudeColorResourceId = R.color.magnitude3;
            break;
        case 4:
            magnitudeColorResourceId = R.color.magnitude4;
            break;
        case 5:
            magnitudeColorResourceId = R.color.magnitude5;
            break;
        case 6:
            magnitudeColorResourceId = R.color.magnitude6;
            break;
        case 7:
            magnitudeColorResourceId = R.color.magnitude7;
            break;
        case 8:
            magnitudeColorResourceId = R.color.magnitude8;
            break;
        case 9:
            magnitudeColorResourceId = R.color.magnitude9;
            break;
        default:
            magnitudeColorResourceId = R.color.magnitude10plus;
            break;
    }
    return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
 }