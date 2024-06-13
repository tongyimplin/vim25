package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostClusterStatusState;
import com.vmware.vim25.VsanHostClusterStatusStateCompletionEstimate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostClusterStatusState", propOrder = {"state", "completion"})
public class VsanHostClusterStatusState extends DynamicData {
  @XmlElement(required = true)
  protected String state;
  
  protected VsanHostClusterStatusStateCompletionEstimate completion;
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public VsanHostClusterStatusStateCompletionEstimate getCompletion() {
    return this.completion;
  }
  
  public void setCompletion(VsanHostClusterStatusStateCompletionEstimate paramVsanHostClusterStatusStateCompletionEstimate) {
    this.completion = paramVsanHostClusterStatusStateCompletionEstimate;
  }
}
