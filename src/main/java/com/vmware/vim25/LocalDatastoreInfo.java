package com.vmware.vim25;

import com.vmware.vim25.DatastoreInfo;
import com.vmware.vim25.LocalDatastoreInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalDatastoreInfo", propOrder = {"path"})
public class LocalDatastoreInfo extends DatastoreInfo {
  protected String path;
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
}
