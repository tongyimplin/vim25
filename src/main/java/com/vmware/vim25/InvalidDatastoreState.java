package com.vmware.vim25;

import com.vmware.vim25.InvalidDatastoreState;
import com.vmware.vim25.InvalidState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDatastoreState", propOrder = {"datastoreName"})
public class InvalidDatastoreState extends InvalidState {
  protected String datastoreName;
  
  public String getDatastoreName() {
    return this.datastoreName;
  }
  
  public void setDatastoreName(String paramString) {
    this.datastoreName = paramString;
  }
}
