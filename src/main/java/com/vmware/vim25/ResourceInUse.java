package com.vmware.vim25;

import com.vmware.vim25.FilterInUse;
import com.vmware.vim25.QuiesceDatastoreIOForHAFailed;
import com.vmware.vim25.ResourceInUse;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceInUse", propOrder = {"type", "name"})
@XmlSeeAlso({QuiesceDatastoreIOForHAFailed.class, FilterInUse.class})
public class ResourceInUse extends VimFault {
  protected String type;
  
  protected String name;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
