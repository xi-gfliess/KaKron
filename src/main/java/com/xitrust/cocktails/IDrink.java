package com.xitrust.cocktails;


public interface IDrink extends Comparable<IDrink> {

	/**
	 * @return namen of the drink
	 */
	public String getName();

	/**
	 * @return volumen
	 */
	public double getVolume();

	
	/**
	 * @return  volumen of alcohol in the drink
	 */
	public double getAlcoholicVolume();

	/**
	 * @return
	 * 		zero 		if alcohol percentage is the same
	 * 		value < 0	if alcohol percentage of that is smaller than this
	 * 		value > 0	if alcohol percentage of that is bigger than this
	 */
	public int compareTo(IDrink that);

}
