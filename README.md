# AutoCompleteDemo
AutoComplete TextView example

## XML file: 

```
    // Include AutoComplete TextView component in the layout
    <AutoCompleteTextView
        android:id="@+id/autoCompleteCountries"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Country name"
    ...
    .../>    
```
## Strings.xml (Values folder): 

Include a string array with the list of elements

```
    <string-array name="countries">
        ...
        <item>Argentina</item>
        <item>Australia</item>
        <item>Austria</item>
        <item>Brazil</item>
        <item>Bulgaria</item>
        <item>Cameroon</item>
        <item>Canada</item>
        <item>Chile</item>
        <item>China</item>
        <item>Colombia</item>
        <item>Croatia</item>
        <item>Denmark</item>
        <item>Dominica</item>
        <item>Dominican Republic</item>
        <item>France</item>
        <item>Germany</item>
        <item>India</item>
        <item>Japan</item>
        <item>Malta</item>
        <item>Mexico</item>
        <item>Monaco</item>
        <item>Mongolia</item>
        <item>Netherlands</item>
        <item>New Zealand</item>
        <item>Nigeria</item>
        <item>Norway</item>
        <item>Panama</item>
        <item>Paraguay</item>
        <item>Peru</item>
        <item>Philippines</item>
        <item>Poland</item>
        <item>Portugal</item>
        <item>Romania</item>
        <item>Russia</item>
        <item>Uganda</item>
        <item>Ukraine</item>
        <item>United Arab Emirates</item>
        <item>United Kingdom</item>
        <item>Uruguay</item>
        <item>United States</item>
        <item>Venezuela</item>
        <item>Vietnam</item>
        <item>Yemen</item>
        <item>Zambia</item>
        ...
    </string-array>
```

## Inckude java/kotlin code in MainActivity
```
...
  autoCompleteTextView = findViewById(R.id.autoCompleteCountries)
  textViewCountry = findViewById(R.id.tvCountryName)
...
  listCountries = resources.getStringArray(R.array.countries)
...
  adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, listCountries)
...
  autoCompleteTextView.setAdapter(adapter)
  autoCompleteTextView.threshold = 1
...
  autoCompleteTextView.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
      textViewCountry.text = adapter.getItem(i)
  }
```

### Checking code for details.

## Visual result:
<p align = "center">
<img src="/images/01.gif" width="350">
</p>
