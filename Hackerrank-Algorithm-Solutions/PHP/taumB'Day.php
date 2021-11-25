<?php
function taumBday($b, $w, $bc, $wc, $z) {
	$bc = $bc < ($wc + $z) ? $bc : ($wc+$z);
	$wc = $wc < ($bc + $z) ? $wc : ($bc + $z);

	return $bc * $b + $wc * $w;
}

echo taumBday(10, 10, 1, 1, 1) . "<br>";
echo taumBday(5, 9, 2, 3, 4) . "<br>";
echo taumBday(3, 6, 9, 1, 1) . "<br>";
echo taumBday(7, 7, 4, 2, 1) . "<br>";

?>