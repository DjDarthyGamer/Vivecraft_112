package jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRDriverManager_FnTable extends Structure {
	public VR_IVRDriverManager_FnTable.GetDriverCount_callback GetDriverCount;
	public VR_IVRDriverManager_FnTable.GetDriverName_callback GetDriverName;
	public interface GetDriverCount_callback extends Callback {
		int apply();
	};
	public interface GetDriverName_callback extends Callback {
		int apply(int nDriver, Pointer pchValue, int unBufferSize);
	};
	public VR_IVRDriverManager_FnTable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("GetDriverCount", "GetDriverName");
	}
	public VR_IVRDriverManager_FnTable(VR_IVRDriverManager_FnTable.GetDriverCount_callback GetDriverCount, VR_IVRDriverManager_FnTable.GetDriverName_callback GetDriverName) {
		super();
		this.GetDriverCount = GetDriverCount;
		this.GetDriverName = GetDriverName;
	}
	public VR_IVRDriverManager_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRDriverManager_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRDriverManager_FnTable implements Structure.ByValue {
		
	};
}
