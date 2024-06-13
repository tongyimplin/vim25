package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
import com.vmware.vim25.HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption", propOrder = {"hostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption"})
public class ArrayOfHostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption {
  @XmlElement(name = "HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption")
  protected List<HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption> hostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
  
  public List<HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption> getHostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption() {
    if (this.hostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption == null)
      this.hostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption = new ArrayList<>(); 
    return this.hostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption;
  }
}
