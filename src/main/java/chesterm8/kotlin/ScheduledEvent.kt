package chesterm8.kotlin

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * POJO for the incoming AWS ScheduledEvent.
 * https://forums.aws.amazon.com/thread.jspa?threadID=221851.
 */
open class ScheduledEvent {

    var account: String? = null

    var region: String? = null

    var detail: Detail? = null

    @JsonProperty("detail-type")
    var detailType: String? = null

    var source: String? = null

    var time: String? = null

    var id: String? = null

    var resources: Array<String>? = null
}