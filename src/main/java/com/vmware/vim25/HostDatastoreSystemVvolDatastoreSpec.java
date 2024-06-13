package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDatastoreSystemVvolDatastoreSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreSystemVvolDatastoreSpec", propOrder = {"name", "scId"})
public class HostDatastoreSystemVvolDatastoreSpec extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String scId;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getScId() {
    return this.scId;
  }
  
  public void setScId(String paramString) {
    this.scId = paramString;
  }
}
