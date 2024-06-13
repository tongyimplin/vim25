package com.vmware.vim25;

import com.vmware.vim25.FileFault;
import com.vmware.vim25.NoDiskSpace;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoDiskSpace", propOrder = {"datastore"})
public class NoDiskSpace extends FileFault {
  @XmlElement(required = true)
  protected String datastore;
  
  public String getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(String paramString) {
    this.datastore = paramString;
  }
}
