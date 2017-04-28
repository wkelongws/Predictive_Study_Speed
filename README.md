# Long-term and short-term traffic speed prediction 

### This predictive study is part of the TIMELI project funded by NSF. The codes in this repo are for data preprocessing using hadoop. The preprocessed data will be feed to deep networks using Keras for supervised learning.

### Use

The two files need to be complied as jars and run on the main hadoop cluster of Intrans.

`TrafficDataPull` contains two map-reduce rounds. Round one reaggreates the raw 20s wavetronix data into a desired grid level (e.g. 5min). Round two reshape the data of each day as a matrix and save in HDFS as a CSV file.

`WeatherDataPull` has the similar function as `TrafficDataPull`.



