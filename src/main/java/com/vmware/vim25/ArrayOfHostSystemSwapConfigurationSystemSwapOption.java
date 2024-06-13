package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSystemSwapConfigurationSystemSwapOption;
import com.vmware.vim25.HostSystemSwapConfigurationSystemSwapOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSystemSwapConfigurationSystemSwapOption", propOrder = {"hostSystemSwapConfigurationSystemSwapOption"})
public class ArrayOfHostSystemSwapConfigurationSystemSwapOption {
  @XmlElement(name = "HostSystemSwapConfigurationSystemSwapOption")
  protected List<HostSystemSwapConfigurationSystemSwapOption> hostSystemSwapConfigurationSystemSwapOption;
  
  public List<HostSystemSwapConfigurationSystemSwapOption> getHostSystemSwapConfigurationSystemSwapOption() {
    if (this.hostSystemSwapConfigurationSystemSwapOption == null)
      this.hostSystemSwapConfigurationSystemSwapOption = new ArrayList<>(); 
    return this.hostSystemSwapConfigurationSystemSwapOption;
  }
}
