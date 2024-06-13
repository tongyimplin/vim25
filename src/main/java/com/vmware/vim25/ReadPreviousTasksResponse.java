package com.vmware.vim25;

import com.vmware.vim25.ReadPreviousTasksResponse;
import com.vmware.vim25.TaskInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ReadPreviousTasksResponse")
public class ReadPreviousTasksResponse {
  protected List<TaskInfo> returnval;
  
  public List<TaskInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
