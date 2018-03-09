/**
 * 
 */
package quicksort;

import java.lang.reflect.Field;

/**
 * @author mtheertha
 *
 */
public class ReflectionWaySettingPrivateField {
	private String advanceWorkflowService; 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class<?> clazz = ReflectionWaySettingPrivateField.class;
		Object cc = clazz.newInstance();

		Field f1 = cc.getClass().getDeclaredField("advanceWorkflowService");
		f1.setAccessible(true);
		f1.set(cc, "Sample");
		String str1 = (String)f1.get(cc);
		System.out.println(str1);
	}
}
