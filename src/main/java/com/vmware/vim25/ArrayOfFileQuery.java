package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFileQuery;
import com.vmware.vim25.FileQuery;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFileQuery", propOrder = {"fileQuery"})
public class ArrayOfFileQuery {
  @XmlElement(name = "FileQuery")
  protected List<FileQuery> fileQuery;
  
  public List<FileQuery> getFileQuery() {
    if (this.fileQuery == null)
      this.fileQuery = new ArrayList<>(); 
    return this.fileQuery;
  }
}
