package hnefatafl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;

import com.cloudgarden.resource.SWTResourceManager;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Main extends org.eclipse.swt.widgets.Composite {
	private Button button1;
	private Button button2;
	private Button button4;
	static private Composite composite2;
	private Button button5;
	private StyledText styledText1;
	private Button button3;
	static private Shell shell;
	static private Button button8;
	private Button button9;
	private StyledText styledText5;
	private Label label1;
	static private Composite composite1;
	static private StyledText styledText4;
	static private StyledText styledText3;
	static private StyledText styledText2;
	static private Button button7;
	static private Button button6;
	static private Main inst;

	{
		//Register as a resource user - SWTResourceManager will
		//handle the obtaining and disposing of resources
		SWTResourceManager.registerResourceUser(this);
	}

	public Main(Composite parent, int style) {
		super(parent, style);
		initGUI();
	}
	
	/**
	* Initializes the GUI.
	*/
	private void initGUI() {
		try {
			{
				composite2 = new Composite(shell, SWT.NONE);
				composite2.setBackground(SWTResourceManager.getColor(192, 192, 192));
				composite2.setLayout(null);				
				{
					label1 = new Label(composite2, SWT.NONE);
					label1.setBounds(0, 0, 650, 650);
				
					ImageData imgData = new ImageData("./hnefatafl/theMap.png");
					Image image = new Image(Display.getDefault(), imgData);
					label1.setImage(image);
				}
				{
					styledText5 = new StyledText(composite2,  SWT.WRAP);
					styledText5.setLayout(null);
					styledText5.setText("\nC5 - C4\nA1 - F11");
					styledText5.setBounds(656, 5, 263, 545);
					styledText5.setOrientation(SWT.VERTICAL);
					styledText5.setDoubleClickEnabled(false);
					styledText5.setDragDetect(false);
					styledText5.setJustify(true);
					styledText5.setEditable(false);
					styledText5.setAlignment(SWT.CENTER);

					button9 = new Button(composite2, SWT.PUSH | SWT.CENTER);
					button9.setText("Menu");
					button9.setBounds(720, 562, 135, 38);
					button9.addMouseListener(new MouseAdapter() {
					public void mouseDown(MouseEvent evt) {
						thisMouseDown3(evt);
					}
				});					
					styledText5.setBlockSelection(false);
					styledText5.setEnabled(false);
				}
			}
			this.setSize(500, 300);
			this.setBackground(SWTResourceManager.getColor(192, 192, 192));

			this.setLayout(null);
			{
				composite1 = new Composite(shell, SWT.NONE);
				composite1.setLayout(null);
				composite1.setBackground(SWTResourceManager.getColor(192, 192, 192));
				composite1.setSize(500, 300);
				{
					button6 = new Button(composite1, SWT.PUSH | SWT.CENTER);
					button6.setText("Human");
					button6.setBounds(262, 83, 137, 25);
				}
				{
					button7 = new Button(composite1, SWT.PUSH | SWT.CENTER);
					button7.setText("AI");
					button7.setBounds(262, 133, 137, 25);
				}
				{
					button8 = new Button(composite1, SWT.PUSH | SWT.CENTER);
					button8.setText("Start");
					button8.setBounds(200, 223, 104, 25);
					button8.addMouseListener(new MouseAdapter() {
					public void mouseDown(MouseEvent evt) {
						thisMouseDown2(evt);
					}
				});
				}
				{
					styledText2 = new StyledText(composite1, SWT.NONE);
					styledText2.setText("Hnefatafl");
					styledText2.setBackground(SWTResourceManager.getColor(192,192,192));
					styledText2.setFont(SWTResourceManager.getFont("Georgia",28,3,false,false));
					styledText2.setOrientation(SWT.VERTICAL);
					styledText2.setEditable(false);
					styledText2.setBounds(158, 20, 188, 45);
				}
				{
					styledText3 = new StyledText(composite1, SWT.NONE);
					styledText3.setText("White     :");
					styledText3.setBackground(SWTResourceManager.getColor(192,192,192));
					styledText3.setFont(SWTResourceManager.getFont("Georgia", 22, 0, false, false));
					styledText3.setOrientation(SWT.VERTICAL);
					styledText3.setEditable(false);
					styledText3.setBounds(74, 76, 126, 35);
				}
				{
					styledText4 = new StyledText(composite1, SWT.NONE);
					styledText4.setText("Black      :");
					styledText4.setBackground(SWTResourceManager.getColor(192,192,192));
					styledText4.setFont(SWTResourceManager.getFont("Georgia", 22, 0, false, false));
					styledText4.setOrientation(SWT.VERTICAL);
					styledText4.setEditable(false);
					styledText4.setBounds(74, 128, 126, 35);
				}
			}			
			{
				button1 = new Button(this, SWT.PUSH | SWT.CENTER);
				button1.setText("New Game");
				button1.setBounds(198, 82, 104, 25);
				button1.addMouseListener(new MouseAdapter() {
					public void mouseDown(MouseEvent evt) {
						thisMouseDown(evt);
					}
				});
			}
			{
				button2 = new Button(this, SWT.PUSH | SWT.CENTER);
				button2.setText("Load");
				button2.setBounds(198, 123, 104, 25);
			}
			{
				button3 = new Button(this, SWT.PUSH | SWT.CENTER);
				button3.setText("Save");
				button3.setBounds(198, 166, 104, 25);
			}
			{
				button4 = new Button(this, SWT.PUSH | SWT.CENTER);
				button4.setText("Resume");
				button4.setBounds(198, 209, 104, 25);
			}
			{
				styledText1 = new StyledText(this, SWT.NONE);
				styledText1.setText("Hnefatafl");
				styledText1.setBounds(158, 20, 188, 45);
				styledText1.setBackground(SWTResourceManager.getColor(192, 192, 192));
				styledText1.setOrientation(SWT.VERTICAL);
				styledText1.setEditable(false);
				styledText1.setFont(SWTResourceManager.getFont("Georgia", 28, 3, false, false));
			}
			{
				button5 = new Button(this, SWT.PUSH | SWT.CENTER);
				button5.setText("Exit");
				button5.setBounds(198, 251, 104, 30);
				button5.setSize(104, 25);
				button5.addMouseListener(new MouseAdapter() {
					public void mouseDown(MouseEvent evt) {
						shell.dispose();
					}
				});				
			}
			this.layout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	* Auto-generated main method to display this 
	* org.eclipse.swt.widgets.Composite inside a new Shell.
	*/
	public static void main(String[] args) {
		Display display = Display.getDefault();		
		shell = new Shell(display,SWT.NO_TRIM);		
		StackLayout shellLayout = new StackLayout();
		shellLayout.topControl = null;
		shell.setLayout(shellLayout);
		inst = new Main(shell, SWT.NULL);
		inst.setSize(500, 300);
		shellLayout.topControl = inst;
		shellLayout.marginHeight = 4;
		shellLayout.marginWidth = 4;
		Point size = inst.getSize();
		shell.layout();
		if(size.x == 0 && size.y == 0) {
			inst.pack();
			shell.pack();
			shell.setSize(534, 349);
		} else {
			Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
			shell.setSize(shellBounds.width, shellBounds.height);
		}
	    Monitor primary = display.getPrimaryMonitor();
	    Rectangle bounds = primary.getBounds();
	    Rectangle rect = shell.getBounds();
	    int x = bounds.x + (bounds.width - rect.width) / 2;
	    int y = bounds.y + (bounds.height - rect.height) / 2;
	    shell.setLocation(x, y);		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}
	
	private void thisMouseDown(MouseEvent evt) {
		System.out.println("this.mouseDown, event="+evt);
		((StackLayout)this.shell.getLayout()).topControl = composite1;
		this.shell.layout();
	}
	
	private void thisMouseDown2(MouseEvent evt) {
		System.out.println("this.mouseDown, event="+evt);
		((StackLayout)this.shell.getLayout()).topControl = composite2;
		shell.setSize(935,658);
		Display display = Display.getDefault();		
	    Monitor primary = display.getPrimaryMonitor();
	    Rectangle bounds = primary.getBounds();
	    Rectangle rect = shell.getBounds();
	    int x = bounds.x + (bounds.width - rect.width) / 2;
	    int y = bounds.y + (bounds.height - rect.height) / 2;
	    shell.setLocation(x, y);			
		this.shell.layout();
	}	
	
	private void thisMouseDown3(MouseEvent evt) {
		System.out.println("this.mouseDown, event="+evt);
		((StackLayout)this.shell.getLayout()).topControl = inst;
		inst.setSize(500, 300);
		Point size = inst.getSize();
		Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
		shell.setSize(shellBounds.width, shellBounds.height);
		Display display = Display.getDefault();		
	    Monitor primary = display.getPrimaryMonitor();
	    Rectangle bounds = primary.getBounds();
	    Rectangle rect = shell.getBounds();
	    int x = bounds.x + (bounds.width - rect.width) / 2;
	    int y = bounds.y + (bounds.height - rect.height) / 2;
	    shell.setLocation(x, y);		
		this.shell.layout();
	}	
	
}
