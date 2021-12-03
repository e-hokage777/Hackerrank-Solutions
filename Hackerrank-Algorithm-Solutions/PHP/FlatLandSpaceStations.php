<?php
function flatlandSpaceStations($n, $c){
	$num_stations = count($c);

	if($n == $num_stations)
		return 0;

	$last_index = $num_stations - 1;
	
	sort($c);

	$max = max($c[0] - 0, ($n-1) - $c[$last_index]);

	for($i = 0; $i < $last_index; $i++){
		$dist = $c[$i+1]-$c[$i];
		$max_dist = $dist % 2 == 0 ? $dist/2 : floor($dist/2);

		if($max_dist > $max)
			$max = $max_dist;

	}

	return $max;
}

echo flatLandSpaceStations(5, [0,4]);
?>