
const ApiUtil = {
    socketUrl: 'ws://localhost:8440/comment',
    commentUrl: '/api/authorize/comment',
    getAllCommentUrl: (postSlug, page) => `/api/public/comment/${postSlug}?page=${page}`,
    getCommentByIdUrl: (postSlug, id) => `/api/authorize/comment/${postSlug}/${id}`,
    getAllChildCommentUrl: (postSlug, supperCommentId, page) => `/api/public/comment/${postSlug}/${supperCommentId}?page=${page}`,
    favouritePostUrl: (postSlug) => `/api/authorize/favourite/${postSlug}`,
    loadNotificationUrl: (page) => `/api/authorize/notification?page=${page}`,
    countNewNotificationUrl: `/api/authorize/notification/count`,
    seenUrl: `/api/authorize/notification`,
}

export default ApiUtil