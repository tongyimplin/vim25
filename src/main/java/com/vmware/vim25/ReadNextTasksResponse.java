package com.vmware.vim25;

import com.vmware.vim25.ReadNextTasksResponse;
import com.vmware.vim25.TaskInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ReadNextTasksResponse")
public class ReadNextTasksResponse {
  protected List<TaskInfo> returnval;
  
  public List<TaskInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
