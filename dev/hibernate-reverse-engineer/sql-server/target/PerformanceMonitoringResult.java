// default package
// Generated Jul 21, 2017 3:20:34 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PerformanceMonitoringResult generated by hbm2java
 */
@Entity
@Table(name = "performance_monitoring_result", schema = "audit", catalog = "Argiope")
public class PerformanceMonitoringResult implements java.io.Serializable {

	private long performanceMonitoringResultId;
	private String className;
	private String methodName;
	private long runtimeMillis;
	private Date runtimeDate;

	public PerformanceMonitoringResult() {
	}

	public PerformanceMonitoringResult(long performanceMonitoringResultId, String className, String methodName,
			long runtimeMillis, Date runtimeDate) {
		this.performanceMonitoringResultId = performanceMonitoringResultId;
		this.className = className;
		this.methodName = methodName;
		this.runtimeMillis = runtimeMillis;
		this.runtimeDate = runtimeDate;
	}

	@Id

	@Column(name = "performance_monitoring_result_id", unique = true, nullable = false)
	public long getPerformanceMonitoringResultId() {
		return this.performanceMonitoringResultId;
	}

	public void setPerformanceMonitoringResultId(long performanceMonitoringResultId) {
		this.performanceMonitoringResultId = performanceMonitoringResultId;
	}

	@Column(name = "class_name", nullable = false)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Column(name = "method_name", nullable = false)
	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@Column(name = "runtime_millis", nullable = false)
	public long getRuntimeMillis() {
		return this.runtimeMillis;
	}

	public void setRuntimeMillis(long runtimeMillis) {
		this.runtimeMillis = runtimeMillis;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "runtime_date", nullable = false, length = 23)
	public Date getRuntimeDate() {
		return this.runtimeDate;
	}

	public void setRuntimeDate(Date runtimeDate) {
		this.runtimeDate = runtimeDate;
	}

}
