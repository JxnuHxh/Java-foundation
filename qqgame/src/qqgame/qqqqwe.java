package qqgame;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

public class qqqqwe{
	public static void main(String[] args) throws AWTException {
		String sentence = "��ǰ����ɽ,ɽ��������,�����и��Ϻ��к�С����,���ж�С����˵��";// ����Ҫ���͵Ļ�
		Robot robot = new Robot();// ����Robot����
		robot.delay(3000);// �ӳ����룬��Ҫ��Ϊ��Ԥ�����򿪴��ڵ�ʱ�䣬�����ڵĵ�λΪ����
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		String[] authors = sentence.split("[,]");// �ַ�������,�ָ�
		for (int j = 0; j < 10; j++) {//ѭ������
			for (int i = 0; i < authors.length; i++) {
				String sentencet = authors[i];
				Transferable tText = new StringSelection(sentencet);
				clip.setContents(tText, null);
				// for (int j = 1; j <= 1; j++) {
				// �������а�����ctrl+v�����ճ������
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);

				robot.keyRelease(KeyEvent.VK_CONTROL);// �ͷ�ctrl��������ctrl���˸����ɾ���������Ĺ����԰������ڰ��º�һ��Ҫ�ͷţ���Ȼ������⡣crtl�����סû���ͷţ��ڰ�������ĸ�����ǣ��ó����Ļ���ctrl�Ŀ�ݼ���
				robot.delay(500);// �ӳ�һ���ٷ��ͣ���Ȼ��һ����ȫ������ȥ����Ϊ���ԵĴ����ٶȺܿ죬ÿ��ճ�����͵��ٶȼ�����һ˲�䣬���Ը��˵ĸо�����һ���Է�����ȫ�������ʱ������Լ��ģ��뼸�뷢��һ��������
				robot.keyPress(KeyEvent.VK_ENTER);// �س� 
				// }
			}
		}
	}
}