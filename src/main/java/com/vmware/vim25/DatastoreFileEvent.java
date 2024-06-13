package com.vmware.vim25;

import com.vmware.vim25.DatastoreEvent;
import com.vmware.vim25.DatastoreFileCopiedEvent;
import com.vmware.vim25.DatastoreFileDeletedEvent;
import com.vmware.vim25.DatastoreFileEvent;
import com.vmware.vim25.DatastoreFileMovedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreFileEvent", propOrder = {"targetFile", "sourceOfOperation", "succeeded"})
@XmlSeeAlso({DatastoreFileDeletedEvent.class, DatastoreFileMovedEvent.class, DatastoreFileCopiedEvent.class})
public class DatastoreFileEvent extends DatastoreEvent {
  @XmlElement(required = true)
  protected String targetFile;
  
  protected String sourceOfOperation;
  
  protected Boolean succeeded;
  
  public String getTargetFile() {
    return this.targetFile;
  }
  
  public void setTargetFile(String paramString) {
    this.targetFile = paramString;
  }
  
  public String getSourceOfOperation() {
    return this.sourceOfOperation;
  }
  
  public void setSourceOfOperation(String paramString) {
    this.sourceOfOperation = paramString;
  }
  
  public Boolean isSucceeded() {
    return this.succeeded;
  }
  
  public void setSucceeded(Boolean paramBoolean) {
    this.succeeded = paramBoolean;
  }
}
