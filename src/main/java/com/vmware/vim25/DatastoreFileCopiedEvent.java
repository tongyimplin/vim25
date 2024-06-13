package com.vmware.vim25;

import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.DatastoreFileCopiedEvent;
import com.vmware.vim25.DatastoreFileEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreFileCopiedEvent", propOrder = {"sourceDatastore", "sourceFile"})
public class DatastoreFileCopiedEvent extends DatastoreFileEvent {
  @XmlElement(required = true)
  protected DatastoreEventArgument sourceDatastore;
  
  @XmlElement(required = true)
  protected String sourceFile;
  
  public DatastoreEventArgument getSourceDatastore() {
    return this.sourceDatastore;
  }
  
  public void setSourceDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.sourceDatastore = paramDatastoreEventArgument;
  }
  
  public String getSourceFile() {
    return this.sourceFile;
  }
  
  public void setSourceFile(String paramString) {
    this.sourceFile = paramString;
  }
}
