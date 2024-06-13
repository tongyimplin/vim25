package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryItem;
import com.vmware.vim25.VsanUpgradeSystemUpgradeStatus;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemUpgradeStatus", propOrder = {"inProgress", "history", "aborted", "completed", "progress"})
public class VsanUpgradeSystemUpgradeStatus extends DynamicData {
  protected boolean inProgress;
  
  protected List<VsanUpgradeSystemUpgradeHistoryItem> history;
  
  protected Boolean aborted;
  
  protected Boolean completed;
  
  protected Integer progress;
  
  public boolean isInProgress() {
    return this.inProgress;
  }
  
  public void setInProgress(boolean paramBoolean) {
    this.inProgress = paramBoolean;
  }
  
  public List<VsanUpgradeSystemUpgradeHistoryItem> getHistory() {
    if (this.history == null)
      this.history = new ArrayList<>(); 
    return this.history;
  }
  
  public Boolean isAborted() {
    return this.aborted;
  }
  
  public void setAborted(Boolean paramBoolean) {
    this.aborted = paramBoolean;
  }
  
  public Boolean isCompleted() {
    return this.completed;
  }
  
  public void setCompleted(Boolean paramBoolean) {
    this.completed = paramBoolean;
  }
  
  public Integer getProgress() {
    return this.progress;
  }
  
  public void setProgress(Integer paramInteger) {
    this.progress = paramInteger;
  }
}
