package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.SnapshotRevertIssue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotRevertIssue", propOrder = {"snapshotName", "event", "errors"})
public class SnapshotRevertIssue extends MigrationFault {
  protected String snapshotName;
  
  protected List<Event> event;
  
  protected boolean errors;
  
  public String getSnapshotName() {
    return this.snapshotName;
  }
  
  public void setSnapshotName(String paramString) {
    this.snapshotName = paramString;
  }
  
  public List<Event> getEvent() {
    if (this.event == null)
      this.event = new ArrayList<>(); 
    return this.event;
  }
  
  public boolean isErrors() {
    return this.errors;
  }
  
  public void setErrors(boolean paramBoolean) {
    this.errors = paramBoolean;
  }
}
