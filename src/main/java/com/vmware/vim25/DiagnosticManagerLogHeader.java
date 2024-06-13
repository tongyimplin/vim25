package com.vmware.vim25;

import com.vmware.vim25.DiagnosticManagerLogHeader;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticManagerLogHeader", propOrder = {"lineStart", "lineEnd", "lineText"})
public class DiagnosticManagerLogHeader extends DynamicData {
  protected int lineStart;
  
  protected int lineEnd;
  
  protected List<String> lineText;
  
  public int getLineStart() {
    return this.lineStart;
  }
  
  public void setLineStart(int paramInt) {
    this.lineStart = paramInt;
  }
  
  public int getLineEnd() {
    return this.lineEnd;
  }
  
  public void setLineEnd(int paramInt) {
    this.lineEnd = paramInt;
  }
  
  public List<String> getLineText() {
    if (this.lineText == null)
      this.lineText = new ArrayList<>(); 
    return this.lineText;
  }
}
