package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NoCompatibleHost;
import com.vmware.vim25.NoCompatibleHostWithAccessToDevice;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoCompatibleHost", propOrder = {"host", "error"})
@XmlSeeAlso({NoCompatibleHostWithAccessToDevice.class})
public class NoCompatibleHost extends VimFault {
  protected List<ManagedObjectReference> host;
  
  protected List<LocalizedMethodFault> error;
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
  
  public List<LocalizedMethodFault> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
}
