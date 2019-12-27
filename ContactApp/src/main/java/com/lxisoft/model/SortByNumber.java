package com.lxisoft.model;
import java.util.Comparator;
import com.lxisoft.domain.Contact;
/**
 *class to sort contacts by number
 */
public class SortByNumber implements Comparator<Contact>
{
	/**
	 *to compare contact using number
	 *
	 *@param c1 contact 1
	 *@param c2 contact 2
	 *@return integer value
	 */
	public int compare(Contact c1,Contact c2)
	{
		return c1.getContactNumber().compareTo(c2.getContactNumber());
	}
}