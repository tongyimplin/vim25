package com.vmware.vim25;

import com.vmware.vim25.NoPermission;
import com.vmware.vim25.RestrictedVersion;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.SolutionUserRequired;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityError")
@XmlSeeAlso({RestrictedVersion.class, NoPermission.class, SolutionUserRequired.class})
public class SecurityError extends RuntimeFault {}
