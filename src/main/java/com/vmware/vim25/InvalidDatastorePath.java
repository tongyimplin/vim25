package com.vmware.vim25;

import com.vmware.vim25.InvalidDatastore;
import com.vmware.vim25.InvalidDatastorePath;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDatastorePath", propOrder = {"datastorePath"})
public class InvalidDatastorePath extends InvalidDatastore {
  @XmlElement(required = true)
  protected String datastorePath;
  
  public String getDatastorePath() {
    return this.datastorePath;
  }
  
  public void setDatastorePath(String paramString) {
    this.datastorePath = paramString;
  }
}
