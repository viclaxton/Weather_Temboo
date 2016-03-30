// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

GetTemperature getTemperatureChoreo = new GetTemperature(session);

// Get an InputSet object for the choreo
GetTemperatureInputSet getTemperatureInputs = getTemperatureChoreo.newInputSet();

// Set inputs
getTemperatureInputs.set_Address("yourValueHere");

// Execute Choreo
GetTemperatureResultSet getTemperatureResults = getTemperatureChoreo.execute(getTemperatureInputs);