package $packageName$.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.ice.datastructures.ICEObject.Component;
import org.eclipse.ice.datastructures.form.Form;
import org.eclipse.ice.datastructures.form.FormStatus;
import org.eclipse.ice.io.serializable.IIOService;
import org.eclipse.ice.io.serializable.IOService;
import org.eclipse.ice.item.Item;

@XmlRootElement(name = "$className$Model")
public class $className$Model extends Item {

	private IIOService ioService;

	public $className$Model() {
		this(null);
	}

	public $className$Model(IProject project) {
		// Setup the form and everything
		super(project);
		// TODO: (optional) Add User Code Here
	}

	@Override
	public void setupForm() {
		// TODO: Add User Code Here
	}
	
	@Override
	protected void setupItemInfo() {
		// TODO: Add User Code Here
	}

	@Override
	protected FormStatus reviewEntries(Form preparedForm) {
		// TODO: Add User Code Here
		return null;
	}

	@Override
	public FormStatus process(String actionName) {
		// TODO: Add User Code Here
		return null;
	}

	@Override
	public void loadInput(String name) {
		// TODO: Add User Code Here
	}
}
